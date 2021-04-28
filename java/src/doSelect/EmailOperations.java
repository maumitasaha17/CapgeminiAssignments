package doSelect;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailOperations {

	public int emailVerify(Email e) {
		String regex = "^(.+)@(.+)$";
		Header emails = e.getHeader();

		List<String> mailids = new ArrayList();
		mailids.add((String) emails.getTo());
		mailids.add((String) emails.getFrom());
		Pattern pattern = Pattern.compile(regex);
		int count = 0;
		for (String email : mailids) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				count++;
			}

		}

		return count;
	}

	public String bodyEncryption(Email e) {
		StringBuffer result = new StringBuffer();
		String body = e.getBody();
		for (int i = 0; i < body.length(); i++) {
			if (Character.isUpperCase(body.charAt(i))) {
				char ch = (char) (((int) body.charAt(i) + 3 - 65) % 26 + 65);
				result.append(ch);
			} else if (Character.isLowerCase(body.charAt(i))) {
				char ch = (char) (((int) body.charAt(i) + 3 - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result.toString();
	}

	public String greetingMessage(Email e) {
		String message = "";
		Header header = e.getHeader();
		String email = header.getFrom();
		int index = email.indexOf('@');
		String name = email.substring(0, index);
		message += e.getGreeting() + " " + name;
		return message;
	}

	public static void main(String[] args) {

		Header header = new Header("user@gmail.com", "user2@gmail.com");
		Email email = new Email(header, "weigueuhu wiueghiwuug WED", "regards");
		EmailOperations emailOperation = new EmailOperations();
		System.out.println(emailOperation.emailVerify(email));
		System.out.println(emailOperation.bodyEncryption(email));
		System.out.println(emailOperation.greetingMessage(email));
	}

	public class Email {
		private Header header;
		private String body;
		private String greeting;

		public Email(Header header, String body, String greeting) {
			this.header = header;
			this.body = body;
			this.greeting = greeting;
		}

		public Header getHeader() {
			return header;
		}

		public void setHeader(Header header) {
			this.header = header;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getGreeting() {
			return greeting;
		}

		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}

	}

	public class Header {
		private String from;
		private String to;

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public Header(String from, String to) {
			this.from = from;
			this.to = to;
		}
	}
}
		