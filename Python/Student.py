class Student:
    #initialize func
    def __init__(self, name, major, gpa, is_on_probation):        #map what attr stu shld have.
        self.name = name
        self.major = major
        self.gpa = gpa
        self.is_on_probation = is_on_probation

    def on_honor_roll(self):
      if(self.gpa >= 3.5):
            return True
      else:
            return False

#def a datatype template of what a student is