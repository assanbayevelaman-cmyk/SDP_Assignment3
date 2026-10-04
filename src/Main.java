public class Main {
    static int pass = 0;
    public static void main(String[] args) {
        if (args.length != 1 || !args[0].equals("--demo"))
            return;
        check("T1", new Circle("C1", new VectorRenderer(), 2), "VECTOR circle radius=2");
        check("T2", new Circle("C1", new RasterRenderer(), 2), "RASTER pixels circle radius=2");
        check("T3", new Square("S1", new VectorRenderer(), 3), "VECTOR square side=3");
        check("T4", new Square("S1", new RasterRenderer(), 3), "RASTER pixels square side=3");
        Circle t5 = new Circle("C1", new VectorRenderer(), 2);
        Circle same = t5;
        String before = t5.execute();
        t5.setImplementation(new RasterRenderer());
        String after = t5.execute();
        boolean ok = same == t5
                && t5.getId().equals("C1")
                && before.contains("VECTOR circle radius=2")
                && after.contains("RASTER pixels circle radius=2");
        if (ok) pass++;
        System.out.println("T5 " + (ok ? "PASS" : "FAIL")
        + " | sameObject=" + (same == t5)
        + " | stateUnchanged=" + t5.getId().equals("C1")
        + " | before=" + before + " | after=" + after);
        check("T6", new Circle("C1", new AsciiRenderer(), 2), "ASCII | circle radius=2");
        check("T7", new Square("S1", new AsciiRenderer(), 3), "ASCII | square side=3");
        System.out.println("SUMMARY: " + pass + "/7 PASS");
    }
    static void check(String id, Shape s, String expected) {
        String actual = s.execute();
        boolean ok = actual.contains(expected);
        if (ok) pass++;
        System.out.println(id + (ok ? " PASS" : " FAIL") + " | result=" + actual);
    }
}
