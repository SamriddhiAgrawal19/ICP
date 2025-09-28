package Day2;

public class Valid_perfect_square {
    
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int range = num/2;
        int root = bs (num,range);
        if(root ==  -1){
            return false;
        }
        return true;
    }
    public int bs(int num , int range){
        int l = 0;
        int r = range;
        while(l<=r){
            long mid = l+(r-l)/2;
            long sq = mid * mid;
            if(sq == num){
                return (int)mid;
            }
            else if(sq < num){
                l  = (int)mid + 1;
            }
            else{
                r = (int)mid - 1;
            }

        }
        return -1;
    }

}
//tc = log(n)
//sc = o(1)
