class countword{
    // public static String[] splitString(String input) {
    //     // Split the input string into an array of strings based on space
    //     String[] words = input.split(" ");
    //     return words;
    // }

    public static void main(String [] args){
        

        String s = "this is my java program";
        int count=0;
        char arr[] = s.toCharArray();
        System.out.println(arr);
        for (char c : arr) {
            System.out.println(c);
        }



        
        // Split the string into an array of strings based on space
     
        
        // Print the array of strings
   


        // for(int i=0;i<s.length();i++){

        //     if(s.charAt(i)==' '){
        //         count++;
        //     }

        // }
        // System.out.println(++count);


        String input = "Hello World Java";
        String[] words = input.split(" ");
        System.out.println("Array of strings:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(words.length);

    }
}