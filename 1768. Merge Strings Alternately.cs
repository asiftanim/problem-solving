public string MergeAlternately(string word1, string word2) {
        int len1 = word1.Length;
        int len2 = word2.Length;
        string result = "";

        if(len1 == len2){
            for(int i=0; i<len1; i++){
                result += word1[i];
                result += word2[i];
            }
        }

        if(len1 < len2){
            for(int i=0; i<len1; i++){
                result += word1[i];
                result += word2[i];
            }
            result += word2.Substring(len1);
        }

        if(len1 > len2){
            for(int i=0; i<len2; i++){
                result += word1[i];
                result += word2[i];
            }
            result += word1.Substring(len2);
        }

        return  result;
    }
