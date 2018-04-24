package com.appOne;

public class Todo {
		private  long id;
	    private String summary;
	    private String description;
		public Todo(long id, String summary, String description) {
			super();
			this.id = id;
			this.summary = summary;
			this.description = description;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	    
	    
	    
	    
}
