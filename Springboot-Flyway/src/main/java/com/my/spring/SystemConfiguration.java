package com.my.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("SystemConfiguration")
public class SystemConfiguration {

	@Value("${datasource.deploy.username}")
	private String dataSourceDeployUser;
	@Value("${datasource.deploy.password}")
	private String dataSourceDeployPassword;
	@Value("${datasource.app.username}")
	private String dataSourceAppUser;
	@Value("${datasource.app.password}")
	private String dataSourceAppPassword;
	@Value("${datasource.url}")
	private String dataSourceUrl;
	@Value("${datasource.driver}")
	private String dataSourceDriverClassName;
	@Value("${flyway.sql.location}")
	private String flyWaySqlLocation;
	public String getDataSourceDeployUser() {
		return dataSourceDeployUser;
	}
	public void setDataSourceDeployUser(String dataSourceDeployUser) {
		this.dataSourceDeployUser = dataSourceDeployUser;
	}
	public String getDataSourceDeployPassword() {
		return dataSourceDeployPassword;
	}
	public void setDataSourceDeployPassword(String dataSourceDeployPassword) {
		this.dataSourceDeployPassword = dataSourceDeployPassword;
	}
	public String getDataSourceAppUser() {
		return dataSourceAppUser;
	}
	public void setDataSourceAppUser(String dataSourceAppUser) {
		this.dataSourceAppUser = dataSourceAppUser;
	}
	public String getDataSourceAppPassword() {
		return dataSourceAppPassword;
	}
	public void setDataSourceAppPassword(String dataSourceAppPassword) {
		this.dataSourceAppPassword = dataSourceAppPassword;
	}
	public String getDataSourceUrl() {
		return dataSourceUrl;
	}
	public void setDataSourceUrl(String dataSourceUrl) {
		this.dataSourceUrl = dataSourceUrl;
	}
	public String getDataSourceDriverClassName() {
		return dataSourceDriverClassName;
	}
	public void setDataSourceDriverClassName(String dataSourceDriverClassName) {
		this.dataSourceDriverClassName = dataSourceDriverClassName;
	}
	public String getFlyWaySqlLocation() {
		return flyWaySqlLocation;
	}
	public void setFlyWaySqlLocation(String flyWaySqlLocation) {
		this.flyWaySqlLocation = flyWaySqlLocation;
	}
	
}
