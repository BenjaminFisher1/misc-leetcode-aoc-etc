class Two_Sum {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        $i = 0;
        $j = count($nums) - 1;

        for ($i = 0; $i < count($nums) - 1; $i++){
            for ($j = $i + 1; $j < count($nums); $j++){
                if($nums[$i] + $nums[$j] == $target){
                    return array($i, $j);
                }
            }
        }
    }
}