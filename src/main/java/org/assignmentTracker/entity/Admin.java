package org.assignmentTracker.entity;

public class Admin {

    private int id;
    private Assignment assignment;
    private User user;


    public Admin() {
    }
    public static class Builder {

        private int id;
        private Assignment assignment;
        private User user;

        public Builder setId(int id){

            this.id= id ;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setAssignment(Assignment assignment) {
            this.assignment = assignment;
            return this;
        }



        public Assignment build() {

            Admin admin = new Admin();
            admin.id = this.id;
            admin.assignment = this.assignment;
            admin.user = this.user;

            return assignment;
        }

        public Builder copy(Admin admin) {

            this.id = admin.id;
            this.assignment = admin.assignment;
            this.user = admin.user;
            return this;
        }

        public Admin build(){return new Admin(this);}

    }



    public int getId() {
        return id;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public User getUser() {
        return user;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Admin{" +
                "id=" + id +
                ", assignment=" + assignment +
                ", user=" + user +
                '}';
    }
}
