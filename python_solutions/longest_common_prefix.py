class solution:
    def longest_common_prefix(self, v:list[str])->str:

        # use a list instead -- JK  this actually did nothing for memory /runtime :(
        # chat says its because loops are costlier in Python than in Java --> more overhead in Python?
        commonPrefix = []
        count = 0
        for letter in v[0]:
            for word in range(1, len(v)):
                if(count>=len(v[word])):
                    return "".join(commonPrefix)
                if(v[word][count]!=letter):
                    return "".join(commonPrefix)
            count += 1
            commonPrefix.append(letter)
        
        return "".join(commonPrefix)

        
        # this presents similar run time issue as doing += for Strings in Java
        # commonPrefix=""
        # count=0
        # for letter in v[0]:
        #     for word in range(1, len(v)):
        #         if(count>=len(v[word])):
        #             return commonPrefix
        #         if(v[word][count]!=letter):
        #             return commonPrefix
        #     count += 1
        #     commonPrefix+=letter
        
        # return commonPrefix

if __name__ == "__main__":  # optional but common
    sol = solution()
    print(sol.longest_common_prefix(["flower", "flow", "flight"]))
