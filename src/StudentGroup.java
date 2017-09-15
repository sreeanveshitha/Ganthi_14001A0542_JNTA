import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
                       for(int i=0;i<students.length;i++){
                         System.out.println(students[i].id +stdents[i].fullName + students[i].birthDate +students[i].avgMark);   
                      }
		return null;
	}

	@Override
	public void setStudents(Student[] students) {throws  IllegalArgumentException
		// Add your implementation here
                                    if(students==NULL){
                     throw new IllegalArgumentException();
                   }
                           else{  
                           int length=students.length;
                          students[length]=students;
                        }
	}

	@Override
	public Student getStudent(int index) { throws IllegalArgumentException
		// Add your implementation here
                 if(index<0 || index >=students.length){
                     throw new IllegalArgumentException();
                   }
                     for(int i=0;i<students.length;i++){
                  if(index==i){
                            return students[i];
                        }
                  }
		
	}

	@Override
	public void setStudent(Student student, int index) {throws IllegalArgumentException
		// Add your implementation here
                                 if(student==NULL || index<0 || index >=students.length){
                     throw new IllegalArgumentException();
                   }
                      else{
                        students[index]=student;
	}
           }

	@Override
	public void addFirst(Student student) {throws IllegalArgumentException
		// Add your implementation here
                                if(student==NULL){
                       throw new IllegalArgumentException();
                        }
                            else{
                             Student temp=students[0];
                              students[0]=student;   
                            for(int i=1;i<=students.length;i++){
                                 Student x=student[i];
                                   student[i]=temp;
                                         temp=x;    
                              }
                         }
	}



	}

	@Override
	public void addLast(Student student) {throws IllegalArgumentException
		// Add your implementation here
                    if(student==NULL){
                       throw new IllegalArgumentException();
                    }
                      else{
                             int length=students.length;
                              students[length]=student;
	}
              }      

	@Override
	public void add(Student student, int index) {throws IllegalArgumentException
		// Add your implementation here
                   if(student==NULL || index<0 || index>students.length){
                       throw new IllegalArgumentException();
                        }
                            else{
                               for(int j=0;j<=students.length;j++){
                                   if(index==j){
                                   Student temp=students[j];
                              students[j]=student;   
                            for(int i=j+1;i<=students.length;i++){
                                 Student x=student[i];
                                   student[i]=temp;
                                         temp=x;    
                            
                              }
                         }

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
                     if(index<0 || index >=students.length){
                     throw new IllegalArgumentException();
                   }
                     for(int i=0;i<students.length;i++){
                  if(index==i){
                            students[i]=students[++i];
                        }
                  }
	
                       
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
                         if(index<0 || index >=students.length){
                     throw new IllegalArgumentException();
                   }
                     for(int i=0;i<students.length;i++){
                  if(student.equals(students[i])){
                            students[i]= students[++i];
                        }
                  }
	
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                                   max=students[0].avgMark;
                             for(int i=0;<students.length;i++){
                              if(students[i].avgMark>max){
                                     max=student[i].avgMark;
                                }
                            }
                          	return max;
	}

	@Override
	public Student getNextStudent(Student student) {throws IllegalArgumentException
		// Add your implementation here
                                if(student==NULL){
                     throw new IllegalArgumentException();
                   }
                     for(int i=0;i<students.length;i++){
                  if(student.equals(sttudents[i])){
                            return students[++i];
                        }
                  }
	
		return null;
	}
}
