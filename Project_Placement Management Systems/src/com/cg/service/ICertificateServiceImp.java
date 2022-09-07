package com.cg.service;

import com.cg.entites.Certificate;
import com.cg.reprository.ICertificateRepositoryImpl;
import com.cg.reprository.IcertificateRepository;

public class ICertificateServiceImp implements ICertificateService 
{
	//1: we are going to use EntityManager method-CRUD
		private IcertificateRepository ce;
		//default constructor
			public ICertificateServiceImp()
			{
				super();
				ce =new ICertificateRepositoryImpl();
				
			}
	//2:IStudentServiceImp  is  Add unimplemented method
		@Override
		public Certificate addCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.addCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate updateCertificate(Certificate certificate) {
			ce.beginTransaction();
			ce.updateCertificate(certificate);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate searchCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.searchCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
		@Override
		public Certificate deleteCertificate(long id) {
			ce.beginTransaction();
			Certificate certificate = ce.deleteCertificate(id);
			ce.commitTransaction();
			return certificate;
		}
	

}