package wiprokushagra.topic1.ass2;


class FinalizeDeclare {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called,perform cleanup."+this.getClass());
	}
}
