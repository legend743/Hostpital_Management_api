package com.example.Hospital.Service;

import com.example.Hospital.Entity.CBCReportEntity;

public interface PathlabService{
	String savecbcdetails(CBCReportEntity cbcreport );

	void fileDownload(Long id);
}
