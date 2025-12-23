class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {

        String[] ar = s.split(" ");

    return ar[ar.length - 1].length();
    }
}
