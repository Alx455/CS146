def anagram(s, t):
    low_s = s.lower()
    low_t = t.lower()
    s_arr = [0] * 26
    t_arr = [0] * 26
    for i in range(0, len(low_s)):
        s_arr[ord(low_s[i]) - 97] + = 1;
    for i in range(0, len(low_t)):
        t_arr[ord(low_t[i]) - 97] += 1;
    if (s_arr == t_arr):
        return False
    return True
