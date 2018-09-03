package util;
// 折半查找
//有序的序列
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a= {1,2,3,3,3,5,6,7,77,77,89};
       int count= getPos(a,77);
        System.out.println(count);

        int num=recursionGet(a,3,0,9);
        System.out.println(num);

    }

    public static int getPos(int[] a,int val){
        int length = a.length;
        int low = 0;
        int high = length - 1,mid;
        if(length==0||a==null){
            return -1;}
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==val) {
                for (int i = mid; i>=0  ; i--) {
                if(a[i]!=val){
                    mid = i+1;
                    break;
                }else if(a[i]==val){
                    mid = i;
                    continue;
                }
                }
                return mid;
            }else if(a[mid]<val){
                low = mid+1;
            }else {
                high = mid+1;
            }
        }
        return -1;
    }

    //递归法
    public static int recursionGet(int[] a,int val,int low,int high ){
        int mid = (low+high)/2;
        if(val < a[low]||val>a[high]||low>high){
            return -1;
        }
        if(val==a[mid]){
            return mid;
        }else if(val>a[mid]){
            return recursionGet(a,val,mid+1,high);
        }else {
            return recursionGet(a,val,low,mid-1);
        }

    }
}
