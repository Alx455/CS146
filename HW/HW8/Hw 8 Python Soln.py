class solution:
    def longestPalindrome(self, s):
        counts = {}
        longest = 0
        largestOddCount = 0
        for i in range(0, len(s)):
            if s[i] in counts:
                counts[s[i]] += 1
            else:
                counts[s[i]] = 1
        for key in counts:
            if counts[key] % 2 == 0:
                longest += counts[key]
            elif counts[key] > largestOddCount:
                largestOddCount = counts[key]
        longest += largestOddCount
        return longest
