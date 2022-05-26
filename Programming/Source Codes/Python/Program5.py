# Python program we have a parent class Employee and a child class Manager and
# include methods to print method that prints the detail of the employee.
class Employee:

    def __init__(self, id, name):
        print("Employee._init_()")
        self.id = id
        self.name = name

    def employeeDetail(self):
        print("ID: %s" % self.id)
        print("Name: %s" % self.name)


class Manager(Employee):

    def __init__(self, id, name, project):
        super().__init__(id, name)
        print("Manager._init_()")
        self.project = project

    def projectDetail(self):
        print("Project: %s" % self.project)


obj = Manager(1, 'Swaroop', 'DBMS')

print("-----Manager Detail-----")
obj.employeeDetail()

print("-----Project Detail-----")
obj.projectDetail()
