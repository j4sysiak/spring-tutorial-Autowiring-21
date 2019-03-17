package pl.jaceksysiak.spring.test;

public class Logger {
	
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	
	public Logger(LogWriter consoleWriter, LogWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text){
		fileWriter.write(text);
	}
	
	public void writeConsole(String text){
		consoleWriter.write(text);
	}

}
































