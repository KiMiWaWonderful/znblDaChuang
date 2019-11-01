package com.company.lanqiao;

//import static com.company.lanqiao.Xianshiweishuxing.My.showTree;

public class MyTree {

//        private Map map = new HashMap();
//
//        public void add(char parent, char child)
//        {
//            List<Character> t = (List<Character>)map.get(parent);
//            if(t==null)
//            {
//                t = new Vector<Character>();
//                map.put(parent, t) ;  // 填空1
//            }
//            t.add(child);
//        }
//        public List<Character> getChild(char x)
//        {
//            return (List<Character>)map.get(x);
//        }
//    }
//    public class My {
//        public static List<String> showTree(MyTree tree, char x) {
//            List<Character> t = tree.getChild(x);
//            List<String> r = new Vector<String>();
//            if (t == null) {
//                r.add("" + x);
//                return r;
//            }
//            for (int i = 0; i < t.size(); i++) {
//                List<String> ri = showTree(tree, t.get(i));
//                for (int j = 0; j < ri.size(); j++) {
//                    String pre = "|  ";
//                    if (j == 0) {
//                        if (i == 0)
//                            pre = x + "--";
//                        else
//                            pre = "|--";
//                    } else {
//                        if (i == t.size() - 1)    // 填空2
//                            pre = "   ";
//                        else
//                            pre = "|  ";
//                    }
//                    r.add(pre + ri.get(j));
//                }
//            }
//            return r;
//        }
//    }
//
//        public static void main(String[] args) {
//            MyTree a = new MyTree();
//            a.add('a', 'b');
//            a.add('b', 'e');
//            a.add('b', 'f');
//            a.add('a', 'c');
//            a.add('a', 'd');
//            a.add('d', 'g');
//            a.add('d', 'i');
//            a.add('g', 'h');
//            a.add('f', 'j');
//            a.add('f', 'k');
//
//            List<String> lst = showTree(a, 'a');
//            for (int i = 0; i < lst.size(); i++) {
//                System.out.println(lst.get(i));
//            }
        }



