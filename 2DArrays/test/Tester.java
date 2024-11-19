package test;

import utilities.Inner;
import utilities.Pair;

final class Tester{
    public static void main(String[] args) {
        Inner.replace(Inner.dubloons, 1, 200);
        Pair p = Inner.warpify(Inner.dubloons);
        Inner.print(p.getInt());
        Inner.print(p.getDouble());
        Inner.replaceWithAvg(Inner.dubloons);
        Inner.replaceWithSum(Inner.dubloons);
        Inner.print(Inner.dubloons);
    }
}