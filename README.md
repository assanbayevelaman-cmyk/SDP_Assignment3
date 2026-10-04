**Name:** Assanbayev Yelaman  
**Group:** SE-2538  
**Topic:** A (Drawing)  
**Repository:** https://github.com/assanbayevelaman-cmyk/SDP_Assignment3  
**Base commit hash:** f98ed06b825ab6d3dff93c4fc668d0a76df15591

## Role Map

- **Abstraction:** Shape - src/Shape.java
- **A1:** Circle - src/Circle.java
- **A2:** Square - src/Square.java
- **Implementor:** Renderer - src/Renderer.java
- **I1:** VectorRenderer - src/VectorRenderer.java
- **I2:** RasterRenderer - src/RasterRenderer.java
- **I3:** AsciiRenderer - src/AsciiRenderer.java
- **Client:** Main - src/Main.java

- Bridge field: `Shape.renderer`
- `execute()`: `Shape.execute()`
- `setImplementation(...)`: `Shape.setImplementation(Renderer)`
- T5 check: `Main.main` (`same == t5`)

## Commands

- javac -encoding UTF-8 -d out "@sources.txt"
- java -cp out Main --demo

## Expected

T1 PASS VECTOR circle radius=2  
T2 PASS RASTER pixels circle radius=2  
T3 PASS VECTOR square side=3  
T4 PASS RASTER pixels square side=3  
T5 PASS same object, state unchanged  
T6 PASS ASCII circle radius=2  
T7 PASS ASCII square side=3  
SUMMARY: 7/7 PASS
