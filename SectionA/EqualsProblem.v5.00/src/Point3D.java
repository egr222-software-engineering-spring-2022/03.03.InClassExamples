public class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public boolean equals(Object o) {            // still bad
        if (o != null && getClass() == o.getClass()) {
            Point3D other = (Point3D) o;                 //
            return super.equals(o) && z == other.z;
        } else {
            return false;
        }
    }
}