import java.io.*;
import java.util.Stack;

public class BazToC {
    public static void main(String[] args) throws IOException {
        int indent_num = 0;
        int temp_variable_count=0;
        Stack<String> stack = new Stack<>();
        File inFile = new File("BazToC/test.baz");
        File outFile = new File("BazToC/test.c");

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFile, true));
        fileWriter.write("#include <stdio.h>\n");
        fileWriter.write("#include <stdlib.h>\n");
        fileWriter.write("#include <string.h>\n");
        fileWriter.write("#include <time.h>\n");
        fileWriter.write("enum baz_val {TRUE, FALSE, BAZ};\n");
        fileWriter.write("void baz_print(enum baz_val v) {\n");
        fileWriter.write("\tif (v == TRUE)\n");
        fileWriter.write("\t\tprintf(\"TRUE\\n\");\n");
        fileWriter.write("\telse if (v == FALSE)\n");
        fileWriter.write("\t\tprintf(\"FALSE\\n\");\n");
        fileWriter.write("\telse if (v == BAZ)\n");
        fileWriter.write("\t\tprintf(\"BAZ\\n\");\n");
        fileWriter.write("}\n\n");

        fileWriter.write("void baz_input(enum baz_val* v) {\n");
        fileWriter.write("\tchar temp[10];\n");
        fileWriter.write("\tscanf(\"%s\", temp);\n");
        fileWriter.write("\tif (!strcmp(temp,\"true\"))\n");
        fileWriter.write("\t\t*v = TRUE;\n");
        fileWriter.write("\telse if (!strcmp(temp,\"false\"))\n");
        fileWriter.write("\t\t*v = FALSE;\n");
        fileWriter.write("\telse if (!strcmp(temp,\"baz\"))\n");
        fileWriter.write("\t\t*v = BAZ;\n");
        fileWriter.write("\telse {\n\t\t*v = 4;\n\t\tprintf(\"YOU ARE WRONG!\\n\");\n\t\tabort();\n\t}\n");
        fileWriter.write("}\n\n");

        fileWriter.write("int main(){\n");
        fileWriter.write("\tsrand(time(NULL));\n");
        fileWriter.write("\tint temp = 0;\n");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            String[] str = line.split(" ");
            for(int i=0;i<indent_num;i++){
                fileWriter.write("\t");
            }
            if(str.length > 1)
                str[1] = (str[1].equals("true") || str[1].equals("false")) || str[1].equals("baz") ? str[1].toUpperCase() : str[1];
            if(str[0].equals("show")){
                if(stack.contains(str[1])) {
                    fileWriter.write("\tbaz_print(" + str[1] + ");\n");
                }
                else{
                    fileWriter.write("\tprintf(\"YOU ARE WRONG!\\n\");\n");
                    fileWriter.write("\tabort();\n");
                }
            }
            else if(str[0].equals("get")){
                if(!stack.contains(str[1])) {
                    temp_variable_count = indent_num >=1 ? ++temp_variable_count : temp_variable_count;
                    stack.push(str[1]);
                    fileWriter.write("\tenum baz_val " + str[1] + ";\n");
                    fileWriter.write("\tbaz_input(&" + str[1] + ");\n");
                }
                else{
                    fileWriter.write("\tbaz_input(&" + str[1] + ");\n");
                }
            }
            else if(str[0].equals("if")){
                if(stack.contains(str[1]) || isBazVariable(str[1])){
                    indent_num++;
                    fileWriter.write("\tif (" + str[1] + " == BAZ) \n");
                    fileWriter.write("\t\t temp = rand()%2;\n");
                    fileWriter.write("\tif (" + str[1] + " == TRUE || temp) {\n");
                }
                else{
                    fileWriter.write("\t{\n");
                    fileWriter.write("\tprintf(\"YOU ARE WRONG!\\n\");\n");
                    fileWriter.write("\tabort();\n");
                }
            }
            else if(str[0].equals("if!")){
                if(stack.contains(str[1]) || isBazVariable(str[1])) {
                    indent_num++;
                    fileWriter.write("\tif (" + str[1] + " == BAZ) \n");
                    fileWriter.write("\t\t temp = rand()%2;\n");
                    fileWriter.write("\tif (" + str[1] + " == FALSE || !temp) {\n");
                }
                else{
                    fileWriter.write("\t{\n");
                    fileWriter.write("\tprintf(\"YOU ARE WRONG!\\n\");\n");
                    fileWriter.write("\tabort();\n");
                }
            }
            else if(str[0].equals("endif")){
                indent_num--;
                for(int i=0; i<temp_variable_count; i++){
                    stack.pop();
                }
                temp_variable_count = 0;
                fileWriter.write("}\n");
            }
            else if(str[0].equals("end")){
                fileWriter.write("return 1;\n");
            }
            else if(str[1].equals("=")){
                if(!stack.contains(str[0]) && isBazVariable(str[2]) ) {
                    temp_variable_count = indent_num >=1 ? ++temp_variable_count : temp_variable_count;
                    stack.push(str[0]);
                    fileWriter.write("\tenum baz_val " + str[0] + " = " + str[2].toUpperCase() + ";\n");
                }
                else{
                    fileWriter.write("\tprintf(\"YOU ARE WRONG!\\n\");\n");
                    fileWriter.write("\tabort();\n");
                }
            }
        }
        fileWriter.write("}\n");
        fileWriter.flush();
    }

    public static boolean isBazVariable(String variable){
        if(variable.equals("true") || variable.equals("false") || variable.equals("baz")){
            return true;
        }
        else {
            return false;
        }
    }


}
