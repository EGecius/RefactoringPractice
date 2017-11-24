package com.example.egidijusgecius.refactoringpractice;

public class ExtractParameterObject {

    public class A {
        private void drawEdge(Graphics g, float edgeWidth, int x1, int x2, int y1, int y2) {
            final Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(edgeWidth));
            g.drawLine(x1, y1, x2, y2);
        }
    }

    private class Graphics {
        private void drawLine(int x1, int y1, int x2, int y2) {
        }
    }

    private class Graphics2D extends Graphics {
        private void setStroke(BasicStroke basicStroke) {

        }
    }

    private class BasicStroke {
        public BasicStroke(float edgeWidth) {
        }
    }
}
