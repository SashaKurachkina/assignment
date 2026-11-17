package sasha_kurochkina;

public class VowelsAndConsonants {
    static void main() {
        String str = "In our hyper-connected world, people consume massive amounts of information every single day. Constant smartphone notifications, endless social media feeds, and work chats create an illusion of productivity while silently exhausting our mental energy. To maintain focus and creativity, taking regular breaks from screens is essential. Even a simple thirty-minute walk without a phone helps lower stress levels, restore attention, and bring a fresh perspective to complex tasks. True rest begins where the stream of incoming messages ends. Knowing when to pause is not a sign of laziness; it is a vital skill for protecting mental health and finding balance in a fast-paced environment. When we allow ourselves moments of quiet reflection, genuine inspiration and energy naturally return for the things that truly matter.";
        int vowelsCount = 0;
        int constantCount =0;
        String vowels = "aeiouy";
        String lowerStr = str.toLowerCase();
        char[] chars = lowerStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                if (vowels.indexOf(chars[i]) != -1){
                    vowelsCount++;
                } else {
                    constantCount++;
                }
        }
        }
        System.out.println("Строка: " + str);
        System.out.println("Гласных: " + vowelsCount);
        System.out.println("Согласных: " + constantCount);

    }
}
