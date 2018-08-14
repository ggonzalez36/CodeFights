boolean checkPalindrome(String inputString) {

    int i1 = 0;
    int i2 = inputString.length() - 1;
    while (i2 > i1) {
        if (inputString.charAt(i1) != inputString.charAt(i2)) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
}
