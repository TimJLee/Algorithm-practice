class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int [] temp = new int[arr1.length];
        String[] answer = new String[arr1.length];
        for(int i=0;i<arr1.length;i++){
            String a = Integer.toBinaryString(arr1[i] | arr2[i]);
            a = String.format("%" + n + "s", a);
            a = a.replace("0", " ");
            a = a.replace("1", "#");
            answer[i]=a;
        }

        return answer;
    }
}