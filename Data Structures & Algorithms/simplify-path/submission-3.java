class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] dirs = path.split("/");
        for (String dir : dirs) {
            if (dir.length() == 0)
                continue;
            if (dir.equals("."))
                continue;
            if (dir.equals("..")) {
                if(!stack.isEmpty()) stack.pop();
                continue;
            }
            stack.push(dir);
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append("/");
            builder.append(stack.removeLast());
        }
        if (builder.isEmpty())
            builder.append("/");
        return builder.toString();
        
    }
}