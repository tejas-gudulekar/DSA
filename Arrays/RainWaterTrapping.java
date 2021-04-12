
/*
 * Given an array of height of building with width as 1 unit we need to findout how much of water can be stored within the
 * gap betweens the building
 */
public class RainWaterTrapping{
	//O(n) with O(1)
	static int getTrapWater(int arr[]) {
		int l = 0;
		int r = arr.length-1;
		int lmax = 0;
		int rmax = 0;
		int water = 0;
		
		while(l<=r) {
			if(arr[l]<=arr[r]) {
				if(arr[l]>=lmax) {
					lmax = arr[l];
				}
				else {
					water += lmax - arr[l];
				}
				l++;
			}
			else {
				if(arr[r]>=rmax) {
					rmax = arr[r];
				} else {
					water += rmax - arr[r];
				}
				r--;
			}
		}
		return water;
	}
	//O(n) with space of O(n)
	static int getTrapWater(int[] arr,int n) {
		 int[] lmax = new int[n];
	      int[] rmax = new int[n];
	      int trapWater=0;
	      int compartor = 0;
	      for(int i=0;i<n;i++){
	          if(arr[i]>=compartor){
	              compartor = arr[i];
	          }
	          lmax[i] = compartor;
	      }
	      compartor = 0;
	      for(int i=n-1;i>=0;i--){
	          if(arr[i]>=compartor){
	              compartor = arr[i];
	          }
	          rmax[i] = compartor;
	      }
	      
	      for(int i=0;i<n;i++){
	        trapWater += (Math.min(lmax[i],rmax[i]) - arr[i]); 
	      }
	      return trapWater;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,5,2,7,6,1,4,2,3};
		System.out.println(getTrapWater(arr));
		
	}
}
