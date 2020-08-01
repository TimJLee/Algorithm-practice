class Solution {
    boolean isB;
    boolean isC;
    boolean isD;
    public int solution(String skill, String[] tree) {
        int []index;
        int count=0;
        for(int i=0;i<tree.length;i++){
            index = new int[skill.length()];
            for(int j=0;j<skill.length();j++){
                if(tree[i].indexOf(skill.substring(j,j+1))==-1) index[j]=26;
                else index[j]= tree[i].indexOf(skill.substring(j,j+1));
            }
            if(isUpper(index)) count++;
            /*
            for(int num : index)
                System.out.print(num+",");
            System.out.println();
            */
        }
        return count;
    }
    public boolean isUpper(int index[]){
        for(int i=0;i<index.length-1;i++){
            if(index[i]>index[i+1]) return false;
        }
        return true;
    }
}