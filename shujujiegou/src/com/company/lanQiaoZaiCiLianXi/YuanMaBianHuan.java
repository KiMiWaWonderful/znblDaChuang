package com.company.lanQiaoZaiCiLianXi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class YuanMaBianHuan {

    private String BoldComments(String tempString, String note) {
        return null;
    }

    public static String process(String s){
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            switch(c[i]){
                case '&': sb.append("&");   break;
                case ' ': sb.append(" ");  break;
                case '<': sb.append("<");     break;
                case '>': sb.append(">");     break;
                case '"': sb.append("\"");   break;
                case '\t': sb.append("    ");   break;
                default: sb.append(c[i]);
            }
        }
        String t = sb.toString();
        t = t.replaceAll("public", "<b>public</b>");
        t = t.replaceAll("class", "<b>class</b>");
        t = t.replaceAll("static", "<b>static</b>");
        t = t.replaceAll("void", "<b>void</b>");
        int n = t.lastIndexOf("//");    // 找到最后边的 "//" 位置
        if(n!=-1){
            String temp = t.substring(n); //为注释 加绿色
            t = t.replaceAll(temp, "<font color=green>"+temp+"</font>");
        }
        t = t+"<br/>\n";
        return t;
    }

    public static void main(String[] args) throws Exception {

        // 定义读取内容
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // 定义输出内容
        PrintWriter pw = new PrintWriter("b.html");
        String s;
        pw.write("<html><body>\n");
        while((s=br.readLine())!=null){
            pw.write(process(s));   // 输出内容
        }
        pw.write("</body></html>");
        br.close();
        pw.close();
        System.out.println("转换成功");

//        try {
//            File inFile = new File("test.java");
//            FileInputStream fileInputStream = new FileInputStream(inFile);
//            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            File outFile = new File("test.html");
//            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
//            OutputStreamWriter outStreamWriter = new OutputStreamWriter(fileOutputStream);
//            BufferedWriter bufferedWriter = new BufferedWriter(outStreamWriter);
//            outStreamWriter.write("<html>\n");
//            outStreamWriter.write("<body>\n");
//            String tempString;
//            while ((tempString = bufferedReader.readLine()) != null) {
//                tempString = tempString.replaceAll("&", "&amp;");
//                tempString = tempString.replaceAll(" ", "&nbsp;");
//                tempString = tempString.replaceAll("<", "&lt;");
//                tempString = tempString.replaceAll(">", "&gt;");
//                int index1 = tempString.lastIndexOf("//");
//                int index2 = tempString.indexOf("\"");
//                if (index1 != -1 && index2 == -1) {
//                    String s1 = tempString.substring(0, index1);
//                    String s2 = tempString.substring(index1);
//                    s2 = "<font color=green>" + s2 + "</font>";
//                    tempString = s1 + s2;
//                }
//                else if(index1 != -1 && index2 != -1) {
//                    int startMark = -1, endMark = -1;
//                    boolean isNote = true;
//                    for (int i = 0; i < tempString.length(); i++) {
//                        if ('\"' == tempString.charAt(i)) {
//                            if (startMark == -1) {
//                                startMark = i;
//                            } else {
//                                endMark = i;
//                                if (index1 > startMark && index1 < endMark) {
//                                    isNote = false;
//                                    break;
//                                } else {
//                                    startMark = -1;
//                                    endMark = -1;
//                                }
//                            }
//                        }
//                    }
//                    if (isNote == true) {
//                        String s1 = tempString.substring(0, index1);
//                        String s2 = tempString.substring(index1);
//                        s2 = "<font color=green>" + s2 + "</font>";
//                        tempString = s1 + s2;
//                    }
//                }
//                tempString = tempString.replaceAll("\"", "&quot;");
//                tempString = tempString.replaceAll("\t",
//                        "&nbsp;&nbsp;&nbsp;&nbsp;");
//                tempString = tempString.replaceAll("&nbsp;public&nbsp;",
//                        "&nbsp;<b>public</b>&nbsp;");
//                tempString = tempString.replaceAll("&nbsp;class&nbsp;",
//                        "&nbsp;<b>class</b>&nbsp;");
//                tempString = tempString.replaceAll("&nbsp;static&nbsp;",
//                        "&nbsp;<b>static</b>&nbsp;");
//                tempString = tempString.replaceAll("&nbsp;void&nbsp;",
//                        "&nbsp;<b>void</b>&nbsp;");
//                outStreamWriter.write(tempString + "<br/>" + "\r\n");
//            }
//            outStreamWriter.write("\n</body>\n");
//            outStreamWriter.write("</html>\n");
//            bufferedWriter.flush();
//            bufferedReader.close();
//            bufferedWriter.close();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }


    }
    }
