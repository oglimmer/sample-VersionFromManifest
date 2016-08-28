<%

de.oglimmer.utils.VersionFromManifest vfm = new de.oglimmer.utils.VersionFromManifest();
vfm.initFromFile(getServletContext().getRealPath("/META-INF/MANIFEST.MF"));
String longVersion = vfm.getLongVersion();

out.println(longVersion);

%>