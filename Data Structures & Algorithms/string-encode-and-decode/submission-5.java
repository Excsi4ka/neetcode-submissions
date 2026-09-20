class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s : strs) {
            builder.append('#').append(s.length()).append('#');
            builder.append(s);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (!str.startsWith("#")) return list;
        int maxLength = str.length();
        int index = 0;
        while (index < maxLength && str.charAt(index) == '#') {
            int endIndex = str.indexOf('#', index + 1);
            int chars = Integer.decode(str.substring(index + 1, endIndex));
            list.add(str.substring(endIndex + 1, endIndex + chars + 1));
            index = chars + endIndex + 1;
        }
        return list;
    }
}
