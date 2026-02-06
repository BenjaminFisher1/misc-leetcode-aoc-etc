class Best_Time_To_Buy_And_Sell_Stocks {

    /**
     * @param Integer[] $prices
     * @return Integer
     */

    function maxProfit($prices) {
        $min = $prices[0];
        $profit = 0;

        foreach ($prices as $price) {
            $min = min($min, $price);
            $profit = max($profit, $price - $min);
        }

        // bcsub($price, $min)
        return $profit;
    }
}
