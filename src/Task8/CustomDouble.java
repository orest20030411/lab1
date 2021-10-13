package Task8;

public class CustomDouble {
    private int integer;
    private double fraction;
    private boolean minus;

    public CustomDouble() {
    }

    public CustomDouble(final int integer, final double aDouble) {
        this.setInteger(integer);
        this.setFraction(aDouble);
    }

    public CustomDouble(final int integer) {
        this.setInteger(integer);
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        if (integer < 0)
            this.minus = true;
        else
            this.minus = false;

        this.integer = Math.abs(integer);
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(final double fraction) {
        if (this.minus == true) {
            final int tmp = -this.integer;
            this.minus = fraction < 0 || tmp < 0 ? true : false;
        } else {
            this.minus = fraction < 0 ? true : false;
        }

        if (Math.abs(fraction) >= 1) {
            this.fraction = Math.abs(this.fraction) % 1;
            this.integer += (int) Math.abs(fraction);
        } else {
            this.fraction = Math.abs(fraction);
        }
    }

    public void setMinus(final boolean minus) {
        this.minus = minus;
    }

    public boolean isMinus() {
        return minus;
    }

    public double toDouble() {
        double res = this.integer + this.fraction;
        return res *= isMinus() ? -1 : 1;
    }

    public CustomDouble add(final CustomDouble arg) {
        final CustomDouble result = new CustomDouble();
        final double res = this.toDouble() + arg.toDouble();
        result.setInteger((int) res);
        result.setFraction(res % 1);
        return result;
    }

    public CustomDouble substraction(final CustomDouble arg) {
        final CustomDouble result = new CustomDouble();
        final double res = this.toDouble() - arg.toDouble();
        result.setInteger((int) res);
        result.setFraction(res % 1);
        return result;
    }

    public CustomDouble multiplication(final CustomDouble arg) {
        final CustomDouble result = new CustomDouble();
        final double res = this.toDouble() * arg.toDouble();
        result.setInteger((int) res);
        result.setFraction(res % 1);
        return result;
    }

    public CustomDouble divide(final CustomDouble arg) {
        final CustomDouble result = new CustomDouble();
        if (arg.toDouble() == 0) throw new ArithmeticException("На нуль не ділиться!");
        final double res = this.toDouble() / arg.toDouble();
        result.setInteger((int) res);
        result.setFraction(res % 1);
        return result;
    }

    public boolean greaterAndEqual(final CustomDouble a) {
        return this.toDouble() >= a.toDouble();
    }

    public boolean smallerAndEqual(final CustomDouble a) {
        return this.toDouble() <= a.toDouble();
    }

    public boolean greater(final CustomDouble a) {
        return !this.smallerAndEqual(a);
    }

    public boolean smaller(final CustomDouble a) {
        return !this.greaterAndEqual(a);
    }

    public boolean notEqual(final CustomDouble a) {
        return !this.equals(a);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final CustomDouble guest = (CustomDouble) obj;
        return integer == guest.getInteger()
                && fraction == guest.getFraction()
                && minus == guest.isMinus();
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 21 * result + integer;
        result = 21 * result + Double.hashCode(fraction);
        result = 21 * result + Boolean.hashCode(minus);

        return result;
    }

    @Override
    public String toString() {
        return "CustomDouble{" +
                "integer=" + integer +
                ", fraction=" + fraction +
                ", minus=" + minus +
                '}';
    }

    public static void main(final String[] args) {
        final CustomDouble test1 = new CustomDouble(20, -0.7);
        final CustomDouble test2 = new CustomDouble(-7, 0.7);
        CustomDouble test3 = new CustomDouble();
        test3 = test1.add(test2);
        System.out.println(test3.toDouble());
    }
}
