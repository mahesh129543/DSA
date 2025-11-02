package extraLeetcode.ARRAYS;

public class buysellprofit121 {




        public static int maxProfit1(int[] prices) {
            int maxPrice = Integer.MIN_VALUE;
            int maxIndex = -1; // store index

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] >= maxPrice) {
                    maxPrice = prices[i];  // update max value
                    maxIndex = i;          // update index
                }
            }



//        return maxPrice;
            int minprice=Integer.MAX_VALUE;
            for (int j= maxIndex; j >= 0; j-- ) {
                if (prices[j] < minprice) {
                    minprice = prices[j];

                }

            }
            System.out.println("Minimum Value: " + minprice);
            System.out.println("Maximum Value: " + maxPrice);
            System.out.println("Maximum Index: " + maxIndex);
            if(minprice > maxPrice){
                return -1;
            }
            int maxprofit=maxPrice-minprice;
            System.out.println("Maximum profit: " + maxprofit);
            return maxPrice;

        }

        public static void main(String[] args) {
            int[] prices = {7,1,5,0,6,4};

            int max = maxProfit1(prices);

        }
    }


