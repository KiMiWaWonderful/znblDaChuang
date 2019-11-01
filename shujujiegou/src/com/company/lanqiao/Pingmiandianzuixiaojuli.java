package com.company.lanqiao;

import java.util.ArrayList;
import java.util.List;

public class Pingmiandianzuixiaojuli {
    static class Point{
        private double x;
        private  double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }


    }
    public  static double distance(Point point, Point point1){
        double px = point.getX()-point1.getX();
        double py = point.getY()-point1.getY();
        return Math.sqrt(px*px + py*py);
    }

    public static double getdistance(List<Point> list){
        if(list == null || list.size()<2){
            return Double.MAX_VALUE;
        }
        double r = Double.MAX_VALUE;
        Point point = list.remove(0);
        for (int i = 0; i <list.size() ; i++) {
            Point point1 = list.get(i);
            double d = distance(point,point1);
            if(d<r){
                r =d;
            }
        }
        double d2 = getdistance(list);
        return d2<r?d2:r;
    }

    public static void main(String[] args) {

        List<Point> list = new ArrayList<Point>() ;
        list.add(new Point(31,4));
        list.add(new Point(1,2));
        list.add(new Point(1,1));
        list.add(new Point(1,4));
        System.out.println(getdistance(list));

    }
}
