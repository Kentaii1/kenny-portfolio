package com.ks.ksPortfolioApi.entity.test;

import jakarta.persistence.*;

@Entity
@Table(name = "test", schema="public")
public class test {
	
	@Id
	@Column( name="test_val" ) String testVal;

	public String getTestVal() {
		return testVal;
	}

	public void setTestVal(String testVal) {
		this.testVal = testVal;
	}

	
}
