class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int>mpp;
        int maxlen=0;
        for(auto &it:nums)
        {
            mpp[it]++;
            maxlen=max(maxlen,mpp[it]);
        }
        int cnt=0;
        for(auto &it:mpp)
        {
            if(it.second==maxlen)   cnt++;
        }
    return cnt*maxlen;
    }
};