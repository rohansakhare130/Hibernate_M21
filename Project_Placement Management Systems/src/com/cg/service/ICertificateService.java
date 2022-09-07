package com.cg.service;

import com.cg.entites.Certificate;

public interface ICertificateService {
	//by default all the method are abstract in the Interface
		 Certificate  addCertificate(Certificate certificate) ; //Certificate
		 Certificate  updateCertificate(Certificate certificate) ; //Certificate
		 Certificate  searchCertificate(long id); //Certificate
		 Certificate deleteCertificate(long id);//Certificate


}
