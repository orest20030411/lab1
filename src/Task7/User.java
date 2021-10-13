package Task7;

public class User {
    private String firstName;
    private String secondName;
    private int age;
    private String email;

    public User(final String firstName, final String secondName, final int age, final String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(final String secondName) {
        this.secondName = secondName;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final User guest = (User) obj;
        return age == guest.age
                && (firstName == guest.firstName
                || (firstName != null &&firstName.equals(guest.getFirstName())))
                && (secondName == guest.secondName
                || (secondName != null && secondName .equals(guest.getSecondName())
        ));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result +((firstName == null) ? 0 : firstName.hashCode());
        result = 31 * result + age;
        result = 31 * result + ((secondName == null) ? 0 : secondName.hashCode());
        return result;
    }
}
