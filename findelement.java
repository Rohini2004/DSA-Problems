public class findelement{
    public  static void main(String args[])
    {
        int [][] arr={{1,4,6,8,10},
            {2,7,9,12,15},
            {3,11,20,22,24},
            {5,16,25,30,40}};
        int target=11;
        System.out.println(find(arr,target));
        }
        public static boolean find(int [][]arr,int target){
            int i=0;
            int j=arr.length-1;
            while(i<arr.length && j>0){
                if(arr[i][j]==target){
                    return true;
                }
                else if (arr[i][j]<target){
                    i++;
                }
                else{
                    j--;
                }
            }
            return false;

        }
    }
