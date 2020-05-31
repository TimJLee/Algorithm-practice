import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static char[][] normalMap;
    static char[][] abnormalMap;
    static int normal;
    static int abnormal;

    static int[][] delta = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        normalMap = new char[N][N];
        abnormalMap = new char[N][N];
        String line;
        for (int i = 0; i < N; ++i) {
            line = br.readLine();
            for (int j = 0; j < N; ++j) {
                normalMap[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (normalMap[i][j] == 'R') {
                    abnormalMap[i][j] = 'G';
                } else
                    abnormalMap[i][j] = normalMap[i][j];
            }
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (normalMap[i][j] != 'X') {
                    dfs(i, j, normalMap);
                    ++normal;
                }
            }
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (abnormalMap[i][j] != 'X') {
                    dfs(i, j, abnormalMap);
                    ++abnormal;
                }
            }
        }

        System.out.print(normal + " " + abnormal);
    }

    private static void dfs(int r, int c, char[][] map) {
        char now = map[r][c];
        map[r][c] = 'X';

        for (int i = 0; i < 4; ++i) {
            int nr = r + delta[i][0];
            int nc = c + delta[i][1];
            if (nr < 0 || nr > N - 1 || nc < 0 || nc > N - 1 || map[nr][nc] == 'X' || now != map[nr][nc]) {
                continue;
            }
            dfs(nr, nc, map);
        }
    }

}
