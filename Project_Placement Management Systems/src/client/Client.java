package client;

import com.cg.entites.Certificate;
import com.cg.entites.Student;
import com.cg.entites.User;
import com.cg.service.ICertificateService;
import com.cg.service.ICertificateServiceImp;
import com.cg.service.IStudentService;
import com.cg.service.IStudentServiceImp;
import com.cg.service.IUserService;
import com.cg.service.IUserServiceImp;

public class Client {

	public static void main(String[] args) {
		//----------------------------------------------------------------	
				// create Certificate and Student association 
				
				
				 //Lazy initialization
				Student s=new Student();
				s.setId(101);
				s.setName("Rohan");
				s.setRoll(10);
				//s.setCollege("JSCOE");
				s.setQualification("BE");
				s.setCourse("E&TC");
				s.setYear(2021);
				s.setHallTicketNo(717113);
				//s.setCertificate("");
			
				IStudentService Service = new IStudentServiceImp();
				Service.addStudent(s);
				Service.updateStudent(s);
				
				
			//----certificate	
				Certificate c = new Certificate();
				//c.setId(202);
				c.setYear(2019);
				
				//c.setCollege("JSCOE");
			
				ICertificateService Service1= new ICertificateServiceImp();
				Service1.addCertificate(c);
				Service1.updateCertificate(c);
				//CService.searchCertificate(201);
				
				
				User u = new User();
				IUserService  user = new IUserServiceImp();
				u.setId(10);
				u.setName("priyanka");
				u.setType("Student");
				u.setPassword("priyanka@123");
				
				user.addNewUser(u);
				
				
				
				System.out.println("Add the Record");
				
			
			//----------------------------------------------------------------	
				/*
				//Retrieve student record
				System.out.println("Student details.....");
				
				c = CService.searchCertificate(1);
				s = Service.searchStudentById(2);
				System.out.println("Certificate id :"+c.getId());
				System.out.println("Certificate Student name :"+s.getName());
				//System.out.println("Certificate college name :"+c.getCollege());
				System.out.println("Certificate year :"+c.getYear());
				*/
			//------------------------------------------------------------------
				/*
				//Update Student record
				s= Service.searchStudentById(1);
				s.setRoll(01);
				
				//Update Certificate record
				c = CService.searchCertificate(201);
				c.setId(202);
				*/
			//------------------------------------------------------------------
				/*
				// Delete Student record
				s = Service.searchStudentById(1); 
				Service.deleteStudent(1);
				System.out.println("Deletion is successful" );
				
				// Delete  record
				c = CService.searchCertificate(201);
				CService.deleteCertificate(201);
				*/	
				
				
				
			}

		}