package org.example.lab13.task3;

interface TextFormatter {
    String formatText(String text);
}

class UpperCaseFormatter implements TextFormatter {
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter {
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter {
    public String formatText(String text) {
        String[] words = text.split(" ");
        StringBuilder camelCase = new StringBuilder();
        for (String word : words) {
            camelCase.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
        }
        return camelCase.toString();
    }
}

class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String formatText(String text) {
        return formatter.formatText(text);
    }
}
class Main{
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        editor.setFormatter(new UpperCaseFormatter());
        System.out.println(editor.formatText("asasfajeasaa lowercase"));
        editor.setFormatter(new LowerCaseFormatter());
        System.out.println(editor.formatText("ASJASDASD UPPERCASE"));
        editor.setFormatter(new CamelCaseFormatter());
        System.out.println(editor.formatText("lazar is here woho"));
    }
}
