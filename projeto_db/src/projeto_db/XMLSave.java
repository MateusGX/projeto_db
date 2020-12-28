/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_db;

/**
 *
 * @author Mateus
 */
public class XMLSave {
    public static String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"projeto_db\" pageWidth=\"595\" pageHeight=\"842\" columnWidth=\"535\" leftMargin=\"20\" rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" uuid=\"b3fca53c-0fa8-4bba-acb7-4314f0888862\">\n" +
"	<property name=\"ireport.zoom\" value=\"2.1435888100000122\"/>\n" +
"	<property name=\"ireport.x\" value=\"0\"/>\n" +
"	<property name=\"ireport.y\" value=\"0\"/>\n" +
"	<style name=\"Title\" forecolor=\"#FFFFFF\" fontName=\"Times New Roman\" fontSize=\"50\" isBold=\"false\" pdfFontName=\"Times-Bold\"/>\n" +
"	<style name=\"SubTitle\" forecolor=\"#CCCCCC\" fontName=\"Times New Roman\" fontSize=\"18\" isBold=\"false\" pdfFontName=\"Times-Roman\"/>\n" +
"	<style name=\"Column header\" forecolor=\"#666666\" fontName=\"Times New Roman\" fontSize=\"14\" isBold=\"true\" pdfFontName=\"Times-Roman\"/>\n" +
"	<style name=\"Detail\" mode=\"Transparent\" fontName=\"Times New Roman\" pdfFontName=\"Times-Roman\"/>\n" +
"	<style name=\"Row\" mode=\"Transparent\" fontName=\"Times New Roman\" pdfFontName=\"Times-Roman\">\n" +
"		<conditionalStyle>\n" +
"			<conditionExpression><![CDATA[$V{REPORT_COUNT}%2 == 0]]></conditionExpression>\n" +
"			<style mode=\"Opaque\" backcolor=\"#F0EFEF\"/>\n" +
"		</conditionalStyle>\n" +
"	</style>\n" +
"	<parameter name=\"DataDe\" class=\"java.util.Date\"/>\n" +
"	<parameter name=\"DataAte\" class=\"java.util.Date\"/>\n" +
"	<queryString language=\"SQL\">\n" +
"		<![CDATA[SELECT\n" +
"     ordens_servico.`id` AS ordens_servico_id,\n" +
"     ordens_servico.`data` AS ordens_servico_data,\n" +
"     ordens_servico.`equipamento` AS ordens_servico_equipamento,\n" +
"     ordens_servico.`valor` AS ordens_servico_valor,\n" +
"     ordens_servico.`cliente_id` AS ordens_servico_cliente_id,\n" +
"     clientes.`id` AS clientes_id,\n" +
"     clientes.`nome` AS clientes_nome,\n" +
"     ordens_servico.`servico` AS ordens_servico_servico\n" +
"FROM\n" +
"     `clientes` clientes INNER JOIN `ordens_servico` ordens_servico ON clientes.`id` = ordens_servico.`cliente_id`\n" +
"WHERE\n" +
"$X{BETWEEN, ordens_servico.`data`, DataDe, DataAte}]]>\n" +
"	</queryString>\n" +
"	<field name=\"ordens_servico_id\" class=\"java.lang.Integer\"/>\n" +
"	<field name=\"ordens_servico_data\" class=\"java.sql.Timestamp\"/>\n" +
"	<field name=\"ordens_servico_equipamento\" class=\"java.lang.String\"/>\n" +
"	<field name=\"ordens_servico_valor\" class=\"java.math.BigDecimal\"/>\n" +
"	<field name=\"clientes_id\" class=\"java.lang.Integer\"/>\n" +
"	<field name=\"clientes_nome\" class=\"java.lang.String\"/>\n" +
"	<field name=\"ordens_servico_servico\" class=\"java.lang.String\"/>\n" +
"	<variable name=\"TotalByGroup\" class=\"java.lang.Number\" resetType=\"Group\" resetGroup=\"clientes_nome\" calculation=\"Sum\">\n" +
"		<variableExpression><![CDATA[$F{ordens_servico_valor}]]></variableExpression>\n" +
"	</variable>\n" +
"	<group name=\"clientes_nome\">\n" +
"		<groupExpression><![CDATA[$F{clientes_nome}]]></groupExpression>\n" +
"		<groupHeader>\n" +
"			<band height=\"37\" splitType=\"Prevent\">\n" +
"				<frame>\n" +
"					<reportElement mode=\"Opaque\" x=\"0\" y=\"7\" width=\"555\" height=\"24\" forecolor=\"#B89F7D\" backcolor=\"#000000\" uuid=\"e2d9b8e5-680a-4c7d-9613-7b60ec2d9351\"/>\n" +
"					<textField isStretchWithOverflow=\"true\">\n" +
"						<reportElement style=\"SubTitle\" isPrintRepeatedValues=\"false\" x=\"2\" y=\"0\" width=\"479\" height=\"24\" forecolor=\"#FFFFFF\" uuid=\"ddbcbf46-b53d-4b4d-a1da-beae10f20fdd\"/>\n" +
"						<textElement verticalAlignment=\"Middle\">\n" +
"							<font isBold=\"false\"/>\n" +
"						</textElement>\n" +
"						<textFieldExpression><![CDATA[$F{clientes_nome}]]></textFieldExpression>\n" +
"					</textField>\n" +
"				</frame>\n" +
"			</band>\n" +
"		</groupHeader>\n" +
"		<groupFooter>\n" +
"			<band height=\"26\">\n" +
"				<staticText>\n" +
"					<reportElement style=\"Column header\" x=\"0\" y=\"7\" width=\"469\" height=\"19\" forecolor=\"#000000\" uuid=\"91764ada-d205-4b48-a2c0-ecbe2031c857\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font isBold=\"false\"/>\n" +
"					</textElement>\n" +
"					<text><![CDATA[TOTAL]]></text>\n" +
"				</staticText>\n" +
"				<textField isStretchWithOverflow=\"true\" pattern=\"¤ #,##0.00\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"474\" y=\"8\" width=\"79\" height=\"18\" uuid=\"3749bb63-f5d2-4a4c-8850-ed9e42d3e442\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$V{TotalByGroup}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<line>\n" +
"					<reportElement x=\"0\" y=\"2\" width=\"555\" height=\"1\" forecolor=\"#999999\" uuid=\"0f9c7d86-e74c-4ae8-8317-700cf7fcf75f\"/>\n" +
"				</line>\n" +
"			</band>\n" +
"		</groupFooter>\n" +
"	</group>\n" +
"	<background>\n" +
"		<band splitType=\"Stretch\"/>\n" +
"	</background>\n" +
"	<title>\n" +
"		<band height=\"89\" splitType=\"Stretch\">\n" +
"			<frame>\n" +
"				<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" width=\"555\" height=\"69\" backcolor=\"#000000\" uuid=\"90354919-a064-498c-b4d2-7654352dafee\"/>\n" +
"				<staticText>\n" +
"					<reportElement style=\"Title\" x=\"0\" y=\"0\" width=\"553\" height=\"69\" uuid=\"ea37b971-1621-4a63-8337-c6074d314d3c\"/>\n" +
"					<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">\n" +
"						<font isBold=\"false\"/>\n" +
"					</textElement>\n" +
"					<text><![CDATA[PROJETO_DB]]></text>\n" +
"				</staticText>\n" +
"			</frame>\n" +
"			<frame>\n" +
"				<reportElement mode=\"Opaque\" x=\"0\" y=\"69\" width=\"555\" height=\"20\" forecolor=\"#000000\" backcolor=\"#CE342C\" uuid=\"931b4730-cb08-4adb-bc71-b82984b8360a\"/>\n" +
"				<textField pattern=\"EEEEE dd MMMMM yyyy\">\n" +
"					<reportElement x=\"24\" y=\"0\" width=\"529\" height=\"20\" forecolor=\"#FFFFFF\" uuid=\"77a16aa0-bbe2-4705-bccf-9b78b52d423b\"/>\n" +
"					<textElement textAlignment=\"Right\" verticalAlignment=\"Middle\">\n" +
"						<font size=\"12\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>\n" +
"				</textField>\n" +
"			</frame>\n" +
"		</band>\n" +
"	</title>\n" +
"	<pageHeader>\n" +
"		<band splitType=\"Stretch\"/>\n" +
"	</pageHeader>\n" +
"	<columnHeader>\n" +
"		<band height=\"26\" splitType=\"Stretch\">\n" +
"			<staticText>\n" +
"				<reportElement style=\"Column header\" x=\"0\" y=\"7\" width=\"54\" height=\"19\" forecolor=\"#000000\" uuid=\"497daf82-993d-40dd-8173-9a8fb522935a\"/>\n" +
"				<textElement verticalAlignment=\"Middle\">\n" +
"					<font isBold=\"false\"/>\n" +
"				</textElement>\n" +
"				<text><![CDATA[ID]]></text>\n" +
"			</staticText>\n" +
"			<staticText>\n" +
"				<reportElement style=\"Column header\" x=\"59\" y=\"8\" width=\"129\" height=\"18\" forecolor=\"#000000\" uuid=\"02dae56a-80a8-4e82-8b5b-750f0dcbec35\"/>\n" +
"				<textElement verticalAlignment=\"Middle\">\n" +
"					<font isBold=\"false\"/>\n" +
"				</textElement>\n" +
"				<text><![CDATA[DATA/HORA]]></text>\n" +
"			</staticText>\n" +
"			<staticText>\n" +
"				<reportElement style=\"Column header\" x=\"193\" y=\"8\" width=\"102\" height=\"18\" forecolor=\"#000000\" uuid=\"914770e3-e89a-4f49-becf-deeda249f2d3\"/>\n" +
"				<textElement verticalAlignment=\"Middle\">\n" +
"					<font isBold=\"false\"/>\n" +
"				</textElement>\n" +
"				<text><![CDATA[EQUIPAMENTO]]></text>\n" +
"			</staticText>\n" +
"			<staticText>\n" +
"				<reportElement style=\"Column header\" x=\"474\" y=\"8\" width=\"81\" height=\"18\" forecolor=\"#000000\" uuid=\"0f213b60-082e-40c9-9a9e-3da066f0f4de\"/>\n" +
"				<textElement verticalAlignment=\"Middle\">\n" +
"					<font isBold=\"false\"/>\n" +
"				</textElement>\n" +
"				<text><![CDATA[VALOR]]></text>\n" +
"			</staticText>\n" +
"			<staticText>\n" +
"				<reportElement style=\"Column header\" x=\"311\" y=\"8\" width=\"158\" height=\"18\" forecolor=\"#000000\" uuid=\"18aae000-db0f-4f73-a1c5-fb9f52ee69cf\"/>\n" +
"				<textElement verticalAlignment=\"Middle\">\n" +
"					<font isBold=\"false\"/>\n" +
"				</textElement>\n" +
"				<text><![CDATA[SERVIÇO]]></text>\n" +
"			</staticText>\n" +
"		</band>\n" +
"	</columnHeader>\n" +
"	<detail>\n" +
"		<band height=\"18\" splitType=\"Stretch\">\n" +
"			<frame>\n" +
"				<reportElement style=\"Row\" mode=\"Opaque\" x=\"0\" y=\"0\" width=\"555\" height=\"18\" uuid=\"08c2d98d-e264-4523-9b33-0b3f49402993\"/>\n" +
"				<textField isStretchWithOverflow=\"true\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"0\" y=\"0\" width=\"54\" height=\"18\" uuid=\"d58b9f24-0a68-4125-98d8-c8a8d464e5a0\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$F{ordens_servico_id}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField isStretchWithOverflow=\"true\" pattern=\"dd/MM/yyyy HH.mm.ss\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"59\" y=\"0\" width=\"129\" height=\"18\" uuid=\"74a807b4-925a-4fa8-8d7c-51947003c25d\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$F{ordens_servico_data}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField isStretchWithOverflow=\"true\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"193\" y=\"0\" width=\"102\" height=\"18\" uuid=\"7475716c-e453-4849-a3b2-e62278113080\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$F{ordens_servico_equipamento}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField isStretchWithOverflow=\"true\" pattern=\"¤ #,##0.00\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"474\" y=\"0\" width=\"79\" height=\"18\" uuid=\"a7ccfba8-0a87-442b-9e0f-c40b53c94ee0\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$F{ordens_servico_valor}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField isStretchWithOverflow=\"true\">\n" +
"					<reportElement style=\"Detail\" positionType=\"Float\" x=\"311\" y=\"0\" width=\"158\" height=\"18\" uuid=\"1ef4846e-11cf-4960-abaa-c3e1458a27b1\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"14\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[$F{ordens_servico_servico}]]></textFieldExpression>\n" +
"				</textField>\n" +
"			</frame>\n" +
"		</band>\n" +
"	</detail>\n" +
"	<columnFooter>\n" +
"		<band height=\"7\" splitType=\"Stretch\">\n" +
"			<line>\n" +
"				<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"3\" width=\"555\" height=\"1\" uuid=\"efb55ee2-dd00-4b8c-a5d6-33ced85071d2\"/>\n" +
"				<graphicElement>\n" +
"					<pen lineWidth=\"0.5\" lineColor=\"#999999\"/>\n" +
"				</graphicElement>\n" +
"			</line>\n" +
"		</band>\n" +
"	</columnFooter>\n" +
"	<pageFooter>\n" +
"		<band height=\"25\" splitType=\"Stretch\">\n" +
"			<frame>\n" +
"				<reportElement mode=\"Opaque\" x=\"0\" y=\"1\" width=\"555\" height=\"24\" forecolor=\"#D0B48E\" backcolor=\"#000000\" uuid=\"3943a57e-5be7-4ab0-a64a-e27067cd790c\"/>\n" +
"				<textField evaluationTime=\"Report\">\n" +
"					<reportElement style=\"Column header\" x=\"513\" y=\"0\" width=\"42\" height=\"24\" forecolor=\"#FFFFFF\" uuid=\"fae93cd0-d410-45c2-a106-418dab5138b5\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"10\" isBold=\"false\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField>\n" +
"					<reportElement style=\"Column header\" x=\"433\" y=\"1\" width=\"80\" height=\"23\" forecolor=\"#FFFFFF\" uuid=\"46ea98be-a118-498d-a3d6-d1580aee2428\"/>\n" +
"					<textElement textAlignment=\"Right\" verticalAlignment=\"Middle\">\n" +
"						<font size=\"10\" isBold=\"false\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression>\n" +
"				</textField>\n" +
"				<textField pattern=\"EEEEE dd MMMMM yyyy\">\n" +
"					<reportElement style=\"Column header\" x=\"2\" y=\"1\" width=\"197\" height=\"23\" forecolor=\"#FFFFFF\" uuid=\"caa47271-35fe-420d-bbbb-32cd67907765\"/>\n" +
"					<textElement verticalAlignment=\"Middle\">\n" +
"						<font size=\"10\" isBold=\"false\"/>\n" +
"					</textElement>\n" +
"					<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>\n" +
"				</textField>\n" +
"			</frame>\n" +
"		</band>\n" +
"	</pageFooter>\n" +
"	<summary>\n" +
"		<band splitType=\"Stretch\"/>\n" +
"	</summary>\n" +
"</jasperReport>";
}
