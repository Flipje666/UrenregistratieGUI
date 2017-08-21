
package service;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Project_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Project");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfTask_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ArrayOfTask");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AppUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "AppUser");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Task_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Task");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AppUserPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Password");
    private final static QName _AppUserUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Username");
    private final static QName _GetUserTasksResponseGetUserTasksResult_QNAME = new QName("http://tempuri.org/", "GetUserTasksResult");
    private final static QName _GetUserTasksUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _RegisterUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _EditHoursTask_QNAME = new QName("http://tempuri.org/", "task");
    private final static QName _EditHoursU_QNAME = new QName("http://tempuri.org/", "u");
    private final static QName _ProjectProjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "ProjectName");
    private final static QName _TaskName_QNAME = new QName("http://schemas.datacontract.org/2004/07/UrenregistratieService", "Name");
    private final static QName _GetUserPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _DeleteHoursResponseDeleteHoursResult_QNAME = new QName("http://tempuri.org/", "DeleteHoursResult");
    private final static QName _SaveHoursResponseSaveHoursResult_QNAME = new QName("http://tempuri.org/", "SaveHoursResult");
    private final static QName _GetUserResponseGetUserResult_QNAME = new QName("http://tempuri.org/", "GetUserResult");
    private final static QName _EditHoursResponseEditHoursResult_QNAME = new QName("http://tempuri.org/", "EditHoursResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteHours }
     * 
     */
    public DeleteHours createDeleteHours() {
        return new DeleteHours();
    }

    /**
     * Create an instance of {@link AppUser }
     * 
     */
    public AppUser createAppUser() {
        return new AppUser();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetUserTasksResponse }
     * 
     */
    public GetUserTasksResponse createGetUserTasksResponse() {
        return new GetUserTasksResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTask }
     * 
     */
    public ArrayOfTask createArrayOfTask() {
        return new ArrayOfTask();
    }

    /**
     * Create an instance of {@link EditHoursResponse }
     * 
     */
    public EditHoursResponse createEditHoursResponse() {
        return new EditHoursResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link SaveHoursResponse }
     * 
     */
    public SaveHoursResponse createSaveHoursResponse() {
        return new SaveHoursResponse();
    }

    /**
     * Create an instance of {@link SaveHours }
     * 
     */
    public SaveHours createSaveHours() {
        return new SaveHours();
    }

    /**
     * Create an instance of {@link EditHours }
     * 
     */
    public EditHours createEditHours() {
        return new EditHours();
    }

    /**
     * Create an instance of {@link DeleteHoursResponse }
     * 
     */
    public DeleteHoursResponse createDeleteHoursResponse() {
        return new DeleteHoursResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserTasks }
     * 
     */
    public GetUserTasks createGetUserTasks() {
        return new GetUserTasks();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Project")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ArrayOfTask")
    public JAXBElement<ArrayOfTask> createArrayOfTask(ArrayOfTask value) {
        return new JAXBElement<ArrayOfTask>(_ArrayOfTask_QNAME, ArrayOfTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "AppUser")
    public JAXBElement<AppUser> createAppUser(AppUser value) {
        return new JAXBElement<AppUser>(_AppUser_QNAME, AppUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Task")
    public JAXBElement<Task> createTask(Task value) {
        return new JAXBElement<Task>(_Task_QNAME, Task.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Password", scope = AppUser.class)
    public JAXBElement<String> createAppUserPassword(String value) {
        return new JAXBElement<String>(_AppUserPassword_QNAME, String.class, AppUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Username", scope = AppUser.class)
    public JAXBElement<String> createAppUserUsername(String value) {
        return new JAXBElement<String>(_AppUserUsername_QNAME, String.class, AppUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Project", scope = AppUser.class)
    public JAXBElement<Project> createAppUserProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, AppUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserTasksResult", scope = GetUserTasksResponse.class)
    public JAXBElement<ArrayOfTask> createGetUserTasksResponseGetUserTasksResult(ArrayOfTask value) {
        return new JAXBElement<ArrayOfTask>(_GetUserTasksResponseGetUserTasksResult_QNAME, ArrayOfTask.class, GetUserTasksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetUserTasks.class)
    public JAXBElement<AppUser> createGetUserTasksUser(AppUser value) {
        return new JAXBElement<AppUser>(_GetUserTasksUser_QNAME, AppUser.class, GetUserTasks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Register.class)
    public JAXBElement<String> createRegisterUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "task", scope = EditHours.class)
    public JAXBElement<String> createEditHoursTask(String value) {
        return new JAXBElement<String>(_EditHoursTask_QNAME, String.class, EditHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "u", scope = EditHours.class)
    public JAXBElement<AppUser> createEditHoursU(AppUser value) {
        return new JAXBElement<AppUser>(_EditHoursU_QNAME, AppUser.class, EditHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "ProjectName", scope = Project.class)
    public JAXBElement<String> createProjectProjectName(String value) {
        return new JAXBElement<String>(_ProjectProjectName_QNAME, String.class, Project.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "Name", scope = Task.class)
    public JAXBElement<String> createTaskName(String value) {
        return new JAXBElement<String>(_TaskName_QNAME, String.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", name = "AppUser", scope = Task.class)
    public JAXBElement<AppUser> createTaskAppUser(AppUser value) {
        return new JAXBElement<AppUser>(_AppUser_QNAME, AppUser.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "task", scope = SaveHours.class)
    public JAXBElement<String> createSaveHoursTask(String value) {
        return new JAXBElement<String>(_EditHoursTask_QNAME, String.class, SaveHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "u", scope = SaveHours.class)
    public JAXBElement<AppUser> createSaveHoursU(AppUser value) {
        return new JAXBElement<AppUser>(_EditHoursU_QNAME, AppUser.class, SaveHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = GetUser.class)
    public JAXBElement<String> createGetUserPassword(String value) {
        return new JAXBElement<String>(_GetUserPassword_QNAME, String.class, GetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = GetUser.class)
    public JAXBElement<String> createGetUserUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, GetUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteHoursResult", scope = DeleteHoursResponse.class)
    public JAXBElement<AppUser> createDeleteHoursResponseDeleteHoursResult(AppUser value) {
        return new JAXBElement<AppUser>(_DeleteHoursResponseDeleteHoursResult_QNAME, AppUser.class, DeleteHoursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_GetUserPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_RegisterUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SaveHoursResult", scope = SaveHoursResponse.class)
    public JAXBElement<AppUser> createSaveHoursResponseSaveHoursResult(AppUser value) {
        return new JAXBElement<AppUser>(_SaveHoursResponseSaveHoursResult_QNAME, AppUser.class, SaveHoursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserResult", scope = GetUserResponse.class)
    public JAXBElement<AppUser> createGetUserResponseGetUserResult(AppUser value) {
        return new JAXBElement<AppUser>(_GetUserResponseGetUserResult_QNAME, AppUser.class, GetUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "task", scope = DeleteHours.class)
    public JAXBElement<String> createDeleteHoursTask(String value) {
        return new JAXBElement<String>(_EditHoursTask_QNAME, String.class, DeleteHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "u", scope = DeleteHours.class)
    public JAXBElement<AppUser> createDeleteHoursU(AppUser value) {
        return new JAXBElement<AppUser>(_EditHoursU_QNAME, AppUser.class, DeleteHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EditHoursResult", scope = EditHoursResponse.class)
    public JAXBElement<AppUser> createEditHoursResponseEditHoursResult(AppUser value) {
        return new JAXBElement<AppUser>(_EditHoursResponseEditHoursResult_QNAME, AppUser.class, EditHoursResponse.class, value);
    }

}
