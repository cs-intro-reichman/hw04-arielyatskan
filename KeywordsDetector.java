public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        for(int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            str += ' ';
            boolean check = false;;
            int j = 0;
            String word = "";
            while (j < str.length()) {
                while(str.charAt(j) != ' ' && j < str.length()) {
                    word += str.charAt(j);
                    j++;
                }
                for(int k = 0; k < keywords.length; k++) {
                    if(areEquals(word, keywords[k])) {
                        check = true;
                        break;
                    }
                }
                if(check)  break;
                j++; 
                word = "";
            }
            if(check)  System.out.println(str.substring(0, str.length()-1));
        }
    }

    public static boolean areEquals(String str1, String str2) {
        if(str1.length() != str2.length())  return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))  return false;
        }
        return true;
    }
}
