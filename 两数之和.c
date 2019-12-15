int * twoSum（int * nums，int numsSize，int target，int * returnSize）{
    int i,j;    
    int  * store = calloc(2,sizeof(int));       // 声明一个2个sizeof(int)字节大小的指针
    
    for (i = 0; i < numsSize; i++)
    {
        int key = target - nums[i];
        for (j = i + 1; j < numsSize; j++)
        {
            if (nums[j] == key)
            {
                store[0] = i;
                store[1] = j;
            }
        }
    }
    *returnSize = 2;
    return store;
}
