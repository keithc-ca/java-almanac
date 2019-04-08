package apidiff.javadoc;

import apidiff.model.MethodInfo;
import apidiff.model.ModuleInfo;

public class JavaDoc9 extends AbstractJavaDoc {

	public JavaDoc9(String baseurl) {
		super(baseurl);
	}

	@Override
	public String getModuleLink(ModuleInfo info) {
		return  baseurl + info.getName() + "-summary.html";
	}
	
	protected String getPackageBase(String moduleName, String packageName) {
		return baseurl + packageName + "/";
	}

	protected String getMethodName(MethodInfo info) {
		String name = info.getName();
		if ("<init>".equals(name)) {
			return info.getOwner().getDisplayName();
		} else {
			return name;
		}
	}

	@Override
	protected String getMethodParameters(MethodInfo info) {
		return "-" + info.getParameterDeclaration("-", false).replace("[]", ":A") + "-";
	}

}
