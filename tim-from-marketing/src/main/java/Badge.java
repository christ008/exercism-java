class Badge {
    public String print(Integer id, String name, String department) {

        boolean isOwner = department == null;
        String badgeDepartment = isOwner ? "OWNER" : department.toUpperCase();

        boolean isNewEmployee = id == null;
        String badgeId = isNewEmployee ? "" : "[" + id + "] - ";

        return badgeId + name + " - " + badgeDepartment;
    }
}
