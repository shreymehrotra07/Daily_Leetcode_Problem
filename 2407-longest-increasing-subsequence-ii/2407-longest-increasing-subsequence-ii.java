class Solution {

    int[] segTree;
    public int lengthOfLIS(int[] nums, int k) {
        
        
        segTree=new int[4*100001];
        
        int ans=1;

        for(int i=0;i<nums.length;i++){
            

            int val=queryMaxInRange(0,0,100001,nums[i]-k,nums[i]-1)+1;

            ans=Math.max(ans,val);


            update(0,0,100001,nums[i],val);

        }

        return ans;
    }


    public void build(int index,int left,int right){

        if(left==right){
            segTree[index]=0;
            return;
        }

        int mid=(left+right)>>1;

        build(2*index+1,left,mid);
        build(2*index+2,mid+1,right);

        segTree[index]=Math.max(segTree[2*index+1],segTree[2*index+2]);
    }


    public void update(int index,int left,int right,int pos,int val){

        if(left==right && left==pos){
            segTree[index]=val;
            return;
        }


        int mid=(left+right)>>1;

        if(pos<=mid) update(2*index+1,left,mid,pos,val);
        else update(2*index+2,mid+1,right,pos,val);

        segTree[index]=Math.max(segTree[2*index+1],segTree[2*index+2]);
    }


    public int queryMaxInRange(int index,int left,int right,int start,int end){

        if(start>right || end<left) return 0;

        if(left>=start && right<=end) return segTree[index];

        int mid=(left+right)>>1;

        return Math.max(
            queryMaxInRange(2*index+1,left,mid,start,end),
            queryMaxInRange(2*index+2,mid+1,right,start,end)
        );
    }
}