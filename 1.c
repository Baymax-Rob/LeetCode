int * twoSum（int * nums，int numsSize，int target，int * returnSize）{
    int i，j;
    int * ret = calloc（2，sizeof（int））;
    对于（i = 0 ; i <numsSize; i ++）{
        int键=目标-nums [i];
        对于（j = i + 1 ; j <numsSize; j ++）
            if（nums [j] ==键）{
                ret [ 0 ] = i;
                ret [ 1 ] = j;
            }
    }
    * returnSize = 2 ;
    返回 ret
}
